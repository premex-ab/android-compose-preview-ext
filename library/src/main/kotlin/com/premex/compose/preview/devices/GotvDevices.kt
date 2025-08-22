package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOTV device specifications for Android Compose previews.
 *
 * This extension provides GOTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gotv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gotv: Any
  get() = object {
      /** GOTV GoFreeTV */
      val GOFREETV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** GOTV HP4BA-GOTV */
      val HP4BA_GOTV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
