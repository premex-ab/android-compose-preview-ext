package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ematic device specifications for Android Compose previews.
 *
 * This extension provides Ematic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ematic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ematic: Any
  get() = object {
      /** Ematic DV8235 */
      val DV8235 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Ematic EGQ101 */
      val EGQ101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Ematic EGQ235SK */
      val EGQ235SK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Ematic EGQ236BD */
      val EGQ236BD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Ematic EGQ238BD */
      val EGQ238BD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Ematic EGQ239BD */
      val EGQ239BD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Ematic Jetstream */
      val JETSTREAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Ematic PBSKD12 */
      val PBSKD12 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Ematic PBSKD7001 */
      val PBSKD7001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Ematic PBSKD7200 */
      val PBSKD7200 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
