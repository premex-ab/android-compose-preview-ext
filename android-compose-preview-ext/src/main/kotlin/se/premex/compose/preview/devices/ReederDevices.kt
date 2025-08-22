package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * REEDER device specifications for Android Compose previews.
 *
 * This extension provides REEDER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reeder.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reeder: Any
  get() = object {
      /** REEDER M7Go_2019 */
      val M7GO_2019 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
