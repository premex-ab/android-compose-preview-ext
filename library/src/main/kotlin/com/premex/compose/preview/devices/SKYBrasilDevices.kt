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
      /** SKY_Brasil usw8052skb */
      val USW8052SKB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
