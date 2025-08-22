package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * cwowdefu device specifications for Android Compose previews.
 *
 * This extension provides cwowdefu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cwowdefu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cwowdefu: Any
  get() = object {
      /** cwowdefu F12W */
      val F12W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
