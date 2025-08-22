package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FONOS_smart_electronics device specifications for Android Compose previews.
 *
 * This extension provides FONOS_smart_electronics device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FonosSmartElectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FonosSmartElectronics: Any
  get() = object {
      /** FONOS_smart_electronics Fonos-O1 */
      val FONOS_O1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
