package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EON_Smart_Box device specifications for Android Compose previews.
 *
 * This extension provides EON_Smart_Box device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EonSmartBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EonSmartBox: Any
  get() = object {
      /** EON_Smart_Box DV8519 */
      val DV8519 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
