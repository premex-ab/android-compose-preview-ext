package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KUU device specifications for Android Compose previews.
 *
 * This extension provides KUU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kuu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kuu: Any
  get() = object {
      /** KUU UPAD2021 */
      val UPAD2021 = "spec:width=1600,height=2176,unit=px,dpi=320"

  }
