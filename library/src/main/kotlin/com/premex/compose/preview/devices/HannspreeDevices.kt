package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hannspree device specifications for Android Compose previews.
 *
 * This extension provides Hannspree device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hannspree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hannspree: Any
  get() = object {
      /** Hannspree HANNSPAD */
      val HANNSPAD = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Hannspree HannspadPro */
      val HANNSPADPRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hannspree HSG1415 */
      val HSG1415 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hannspree mid1024_e */
      val MID1024_E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hannspree rk3368_32 */
      val RK3368_32 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
