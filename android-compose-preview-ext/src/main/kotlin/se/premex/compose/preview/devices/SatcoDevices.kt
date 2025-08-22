package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SATCO device specifications for Android Compose previews.
 *
 * This extension provides SATCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Satco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Satco: Any
  get() = object {
      /** SATCO Y-20 */
      val Y_20 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
