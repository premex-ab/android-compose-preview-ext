package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SICON device specifications for Android Compose previews.
 *
 * This extension provides SICON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sicon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sicon: Any
  get() = object {
      /** SICON keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
