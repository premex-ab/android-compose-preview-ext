package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eSTAR device specifications for Android Compose previews.
 *
 * This extension provides eSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ESTAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ESTAR: Any
  get() = object {
      /** eSTAR Digni-Smart */
      val DIGNI_SMART = "spec:width=720,height=1600,unit=px,dpi=320"

      /** eSTAR martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** eSTAR MID1020L */
      val MID1020L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** eSTAR MID7388 */
      val MID7388 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** eSTAR MID7399 */
      val MID7399 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** eSTAR tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** eSTAR yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
