package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EVOTA device specifications for Android Compose previews.
 *
 * This extension provides EVOTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evota.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evota: Any
  get() = object {
      /** EVOTA MTK9679 */
      val MTK9679 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
