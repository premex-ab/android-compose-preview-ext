package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Imose device specifications for Android Compose previews.
 *
 * This extension provides Imose device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imose.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imose: Any
  get() = object {
      /** Imose BAM_III */
      val BAM_III = "spec:width=480,height=960,unit=px,dpi=240"

      /** Imose Omotab2 */
      val OMOTAB2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Imose Omotab_2s */
      val OMOTAB_2S = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Imose SEMPE */
      val SEMPE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
