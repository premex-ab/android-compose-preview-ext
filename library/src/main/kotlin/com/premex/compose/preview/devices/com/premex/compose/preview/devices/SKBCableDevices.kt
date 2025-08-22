package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKB_Cable device specifications for Android Compose previews.
 *
 * This extension provides SKB_Cable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKBCable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKBCable: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKB_Cable, code=K1100UA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB_Cable, code=K1100UA,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val K1100UA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
