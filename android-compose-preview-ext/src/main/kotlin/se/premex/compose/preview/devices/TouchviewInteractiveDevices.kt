package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Touchview_Interactive device specifications for Android Compose previews.
 *
 * This extension provides Touchview_Interactive device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TouchviewInteractive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TouchviewInteractive: Any
  get() = object {
      /** Touchview_Interactive TVULTRA98_G5 */
      val TVULTRA98_G5 = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
