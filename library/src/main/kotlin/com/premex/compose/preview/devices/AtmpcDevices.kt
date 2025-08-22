package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATMPC device specifications for Android Compose previews.
 *
 * This extension provides ATMPC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Atmpc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Atmpc: Any
  get() = object {
      /** ATMPC IT-1001A */
      val IT_1001A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATMPC IT_701A */
      val IT_701A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATMPC IT_701A1 */
      val IT_701A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATMPC IT-801B */
      val IT_801B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATMPC IT-801BA3 */
      val IT_801BA3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
