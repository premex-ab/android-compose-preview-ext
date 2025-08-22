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
 * @Preview(device = Devices.GOTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOTV, code=GoFreeTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOTV, code=GoFreeTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GOFREETV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GOTV, code=HP4BA-GOTV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOTV, code=HP4BA-GOTV, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HP4BA_GOTV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
