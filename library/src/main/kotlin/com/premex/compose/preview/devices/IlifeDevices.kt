package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * I-life device specifications for Android Compose previews.
 *
 * This extension provides I-life device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ilife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ilife: Any
  get() = object {
      /** I-life ITELL_K3102N */
      val ITELL_K3102N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** I-life ITELL_K3500N */
      val ITELL_K3500N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** I-life ITELL_K3800Q */
      val ITELL_K3800Q = "spec:width=800,height=1280,unit=px,dpi=160"

  }
