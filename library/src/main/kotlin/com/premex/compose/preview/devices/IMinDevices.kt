package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iMin device specifications for Android Compose previews.
 *
 * This extension provides iMin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMin: Any
  get() = object {
      /** iMin Crane1 */
      val CRANE1 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** iMin Falcon2 */
      val FALCON2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iMin I22T01 */
      val I22T01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iMin Lark1 */
      val LARK1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** iMin Swan1Pro */
      val SWAN1PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** iMin Swan2 */
      val SWAN2 = "spec:width=1080,height=1920,unit=px,dpi=186"

      /** iMin Swan2Printer */
      val SWAN2PRINTER = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** iMin Swift1Pro */
      val SWIFT1PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** iMin Swift2 */
      val SWIFT2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** iMin Swift2Pro */
      val SWIFT2PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
