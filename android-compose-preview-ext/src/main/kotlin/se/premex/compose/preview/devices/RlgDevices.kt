package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RLG device specifications for Android Compose previews.
 *
 * This extension provides RLG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rlg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rlg: Any
  get() = object {
      /** RLG Eagle-2024 */
      val EAGLE_2024 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
