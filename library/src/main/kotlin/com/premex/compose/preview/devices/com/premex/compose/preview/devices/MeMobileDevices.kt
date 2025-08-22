package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Me_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Me_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MeMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MeMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Me_Mobile, code=Grace_9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Me_Mobile, code=Grace_9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GRACE_9 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
