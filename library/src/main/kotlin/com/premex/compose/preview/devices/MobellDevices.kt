package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobell device specifications for Android Compose previews.
 *
 * This extension provides mobell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobell: Any
  get() = object {
      /** mobell MBLTab81 */
      val MBLTAB81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** mobell NOVA_P3 */
      val NOVA_P3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
