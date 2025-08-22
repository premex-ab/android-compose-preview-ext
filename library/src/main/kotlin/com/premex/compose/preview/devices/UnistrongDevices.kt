package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unistrong device specifications for Android Compose previews.
 *
 * This extension provides Unistrong device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unistrong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unistrong: Any
  get() = object {
      /** Unistrong UT12P */
      val UT12P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Unistrong UT32 */
      val UT32 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Unistrong UT56 */
      val UT56 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
