package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iGET device specifications for Android Compose previews.
 *
 * This extension provides iGET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iget.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iget: Any
  get() = object {
      /** iGET iGET_SMART_G101 */
      val IGET_SMART_G101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET iGET_SMART_G102 */
      val IGET_SMART_G102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET iGET_SMART_L102 */
      val IGET_SMART_L102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_G81 */
      val SMART_G81 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_G81H */
      val SMART_G81H = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_L103 */
      val SMART_L103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_L104_eea */
      val SMART_L104_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_L11 */
      val SMART_L11 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** iGET SMART_L206 */
      val SMART_L206 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** iGET SMART_L20X */
      val SMART_L20X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** iGET SMART_L30 */
      val SMART_L30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iGET SMART_L31 */
      val SMART_L31 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iGET SMART_L32 */
      val SMART_L32 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iGET SMART_W101 */
      val SMART_W101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_W10X_EEA */
      val SMART_W10X_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_W202 */
      val SMART_W202 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_W203 */
      val SMART_W203 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_W20X */
      val SMART_W20X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iGET SMART_W30_EEA */
      val SMART_W30_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** iGET SMART_W31_EEA */
      val SMART_W31_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** iGET SMART_W32 */
      val SMART_W32 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iGET SMART_W84_EEA */
      val SMART_W84_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iGET SMART_W8X */
      val SMART_W8X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iGET SMART_W8_Kids */
      val SMART_W8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

  }
