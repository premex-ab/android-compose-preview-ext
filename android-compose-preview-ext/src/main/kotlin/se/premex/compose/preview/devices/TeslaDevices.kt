package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TESLA device specifications for Android Compose previews.
 *
 * This extension provides TESLA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tesla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tesla: Any
  get() = object {
      /** TESLA Tesla_SP9_1_Lite */
      val TESLA_SP9_1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
