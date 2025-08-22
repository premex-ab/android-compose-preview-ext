package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IDC device specifications for Android Compose previews.
 *
 * This extension provides IDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Idc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Idc: Any
  get() = object {
      /** IDC EVO_G4 */
      val EVO_G4 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
