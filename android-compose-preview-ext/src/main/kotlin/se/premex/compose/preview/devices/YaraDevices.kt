package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YARA device specifications for Android Compose previews.
 *
 * This extension provides YARA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yara.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yara: Any
  get() = object {
      /** YARA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
