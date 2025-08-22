package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PC_Smart device specifications for Android Compose previews.
 *
 * This extension provides PC_Smart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PCSmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PCSmart: Any
  get() = object {
      /** PC_Smart PCSGOB10LTE-V2 */
      val PCSGOB10LTE_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
