package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dunns_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Dunns_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DunnsMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DunnsMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dunns_Mobile, code=ETAB_M9041G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dunns_Mobile, code=ETAB_M9041G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ETAB_M9041G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
