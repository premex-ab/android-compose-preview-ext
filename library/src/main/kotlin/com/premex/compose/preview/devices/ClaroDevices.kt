package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Claro device specifications for Android Compose previews.
 *
 * This extension provides Claro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Claro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Claro: Any
  get() = object {
      /** Claro B866V2_V1_0_0 */
      val B866V2_V1_0_0 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** Claro claro_vsb3918 */
      val CLARO_VSB3918 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Claro SEI700CPR */
      val SEI700CPR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Claro SEI800CCOA */
      val SEI800CCOA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Claro SEI810CCOA */
      val SEI810CCOA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Claro SEI810CPR */
      val SEI810CPR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Claro SEI900CCOAS */
      val SEI900CCOAS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
