package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KOGAN device specifications for Android Compose previews.
 *
 * This extension provides KOGAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kogan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kogan: Any
  get() = object {
      /** KOGAN SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KOGAN SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
