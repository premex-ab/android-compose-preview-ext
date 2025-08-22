package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TJD device specifications for Android Compose previews.
 *
 * This extension provides TJD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TJD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TJD: Any
  get() = object {
      /** TJD MT-1011 */
      val MT_1011 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** TJD MT-1011OF */
      val MT_1011OF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TJD MT-1011QR */
      val MT_1011QR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TJD MT_1025QU */
      val MT_1025QU = "spec:width=800,height=1280,unit=px,dpi=186"

      /** TJD MT-710QF */
      val MT_710QF = "spec:width=600,height=1024,unit=px,dpi=213"

      /** TJD MT-710QU */
      val MT_710QU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TJD MT-710QU_Pro */
      val MT_710QU_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TJD MT-717QW */
      val MT_717QW = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TJD MT-750QR */
      val MT_750QR = "spec:width=1080,height=1440,unit=px,dpi=280"

      /** TJD MT-750QU */
      val MT_750QU = "spec:width=1080,height=1440,unit=px,dpi=213"

      /** TJD MT-761QU_Pro */
      val MT_761QU_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TJD MT-790QR_V1 */
      val MT_790QR_V1 = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
