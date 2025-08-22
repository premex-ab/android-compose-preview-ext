package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JREN device specifications for Android Compose previews.
 *
 * This extension provides JREN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JREN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JREN: Any
  get() = object {
      /** JREN J10 */
      val J10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** JREN J10PLUS */
      val J10PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** JREN J10PRO */
      val J10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JREN J11 */
      val J11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JREN J11PLUS */
      val J11PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** JREN JR-802 */
      val JR_802 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** JREN JR_J1063 */
      val JR_J1063 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JREN JR-J10A */
      val JR_J10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JREN JR_J7 */
      val JR_J7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** JREN JR-J71 */
      val JR_J71 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
