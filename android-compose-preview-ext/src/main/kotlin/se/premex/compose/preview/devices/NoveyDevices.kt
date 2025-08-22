package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * novey device specifications for Android Compose previews.
 *
 * This extension provides novey device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Novey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Novey: Any
  get() = object {
      /** novey Alpha_A16 */
      val ALPHA_A16 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** novey Start_S */
      val START_S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
