package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Supersonic device specifications for Android Compose previews.
 *
 * This extension provides Supersonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Supersonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Supersonic: Any
  get() = object {
      /** Supersonic SC_1010JBBT */
      val SC_1010JBBT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supersonic SC-2110 */
      val SC_2110 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supersonic SC_3107 */
      val SC_3107 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supersonic SC_3110 */
      val SC_3110 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Supersonic SC-4317BT */
      val SC_4317BT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supersonic SC_5310BDL */
      val SC_5310BDL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Supersonic SC_779KT */
      val SC_779KT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supersonic SC-813 */
      val SC_813 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
