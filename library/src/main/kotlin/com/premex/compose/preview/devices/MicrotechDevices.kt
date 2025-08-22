package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Microtech device specifications for Android Compose previews.
 *
 * This extension provides Microtech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Microtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Microtech: Any
  get() = object {
      /** Microtech etab_LTE */
      val ETAB_LTE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Microtech ETL101A_EEA */
      val ETL101A_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Microtech ETW101GT_C_EEA */
      val ETW101GT_C_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Microtech ETW101GT_EEA */
      val ETW101GT_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
