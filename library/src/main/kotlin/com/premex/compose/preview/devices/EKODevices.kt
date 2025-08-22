package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EKO device specifications for Android Compose previews.
 *
 * This extension provides EKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EKO: Any
  get() = object {
      /** EKO bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO expo */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO ICN */
      val ICN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO patrick */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO tennoji */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EKO yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EKO zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
