package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TES device specifications for Android Compose previews.
 *
 * This extension provides TES device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tes: Any
  get() = object {
      /** TES igs-series */
      val IGS_SERIES = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** TES igs-series-gen2 */
      val IGS_SERIES_GEN2 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
