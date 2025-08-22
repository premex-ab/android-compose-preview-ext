package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HORIZON device specifications for Android Compose previews.
 *
 * This extension provides HORIZON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Horizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Horizon: Any
  get() = object {
      /** HORIZON Interactive_White_Board */
      val INTERACTIVE_WHITE_BOARD = "spec:width=2160,height=3840,unit=px,dpi=640"

  }
