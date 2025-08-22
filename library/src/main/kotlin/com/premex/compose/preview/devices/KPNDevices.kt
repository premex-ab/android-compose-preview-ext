package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KPN device specifications for Android Compose previews.
 *
 * This extension provides KPN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KPN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KPN: Any
  get() = object {
      /** KPN m250_k */
      val M250_K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KPN m393vsb_kpn */
      val M393VSB_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
