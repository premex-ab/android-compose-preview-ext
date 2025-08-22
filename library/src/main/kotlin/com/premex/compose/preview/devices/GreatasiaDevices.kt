package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GREATASIA device specifications for Android Compose previews.
 *
 * This extension provides GREATASIA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greatasia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greatasia: Any
  get() = object {
      /** GREATASIA E101GC */
      val E101GC = "spec:width=800,height=1280,unit=px,dpi=180"

      /** GREATASIA E101GC4G */
      val E101GC4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GREATASIA E108GC */
      val E108GC = "spec:width=800,height=1280,unit=px,dpi=170"

      /** GREATASIA E10A133_EEA */
      val E10A133_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GREATASIA E10_A133_EEA */
      val E10_A133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GREATASIA E700_Kids_EEA */
      val E700_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GREATASIA E720_EEA */
      val E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GREATASIA E9863 */
      val E9863 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** GREATASIA TK_E109GCM */
      val TK_E109GCM = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** GREATASIA TK_E720_EEA */
      val TK_E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GREATASIA TK-P1197 */
      val TK_P1197 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
