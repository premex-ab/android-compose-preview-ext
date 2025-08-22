package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VNPTTechnology device specifications for Android Compose previews.
 *
 * This extension provides VNPTTechnology device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VNPTTechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VNPTTechnology: Any
  get() = object {
      /** VNPTTechnology vnptt_smb_3 */
      val VNPTT_SMB_3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VNPTTechnology vnptt_smb_v2x */
      val VNPTT_SMB_V2X = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VNPTTechnology VNTTab2 */
      val VNTTAB2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** VNPTTechnology VNT_Tab8 */
      val VNT_TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
