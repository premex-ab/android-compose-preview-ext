package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOZIFAN device specifications for Android Compose previews.
 *
 * This extension provides WOZIFAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wozifan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wozifan: Any
  get() = object {
      /** WOZIFAN W10_EEA */
      val W10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOZIFAN W10_T_US */
      val W10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOZIFAN W10_US */
      val W10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOZIFAN W3_EEA */
      val W3_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WOZIFAN W3_US */
      val W3_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
