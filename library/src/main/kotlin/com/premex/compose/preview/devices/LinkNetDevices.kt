package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LinkNet device specifications for Android Compose previews.
 *
 * This extension provides LinkNet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LinkNet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LinkNet: Any
  get() = object {
      /** LinkNet DCN88_72604_LN */
      val DCN88_72604_LN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LinkNet DMTS21LC */
      val DMTS21LC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LinkNet DTC2140 */
      val DTC2140 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LinkNet DTC2160 */
      val DTC2160 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LinkNet DTC9565 */
      val DTC9565 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LinkNet DTP2162 */
      val DTP2162 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LinkNet DTP9718 */
      val DTP9718 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
