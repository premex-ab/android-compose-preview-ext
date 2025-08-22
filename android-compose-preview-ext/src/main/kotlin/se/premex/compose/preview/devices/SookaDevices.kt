package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * sooka device specifications for Android Compose previews.
 *
 * This extension provides sooka device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sooka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sooka: Any
  get() = object {
      /** sooka sooka-TV_v1 */
      val SOOKA_TV_V1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
