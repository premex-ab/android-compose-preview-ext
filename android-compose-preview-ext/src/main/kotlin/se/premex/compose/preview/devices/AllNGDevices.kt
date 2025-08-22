package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALL_N_G device specifications for Android Compose previews.
 *
 * This extension provides ALL_N_G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AllNG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AllNG: Any
  get() = object {
      /** ALL_N_G mypad2 */
      val MYPAD2 = "spec:width=752,height=1280,unit=px,dpi=160"

  }
