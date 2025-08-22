package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKB device specifications for Android Compose previews.
 *
 * This extension provides SKB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skb: Any
  get() = object {
      /** SKB BFX-AT100 */
      val BFX_AT100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB BFX-UA300 */
      val BFX_UA300 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB BIP-AI100 */
      val BIP_AI100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB BIP-EB100 */
      val BIP_EB100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB BIP-UW200 */
      val BIP_UW200 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB BMA-AI100 */
      val BMA_AI100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB INTEKS20SI */
      val INTEKS20SI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKB INTEKS21SI */
      val INTEKS21SI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
