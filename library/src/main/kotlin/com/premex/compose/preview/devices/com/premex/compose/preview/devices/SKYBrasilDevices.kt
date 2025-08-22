package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY_Brasil device specifications for Android Compose previews.
 *
 * This extension provides SKY_Brasil device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYBrasil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYBrasil: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKY_Brasil, code=usw8052skb, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_Brasil, code=usw8052skb,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val USW8052SKB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
