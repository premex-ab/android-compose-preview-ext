package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LYF device specifications for Android Compose previews.
 *
 * This extension provides LYF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lyf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lyf: Any
  get() = object {
      /** LYF C-451 */
      val C_451 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LYF FL7008 */
      val FL7008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LYF HL-L51P */
      val HL_L51P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-4006 */
      val LS_4006 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LYF LS-4008 */
      val LS_4008 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LYF LS-4503 */
      val LS_4503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LYF LS-4505 */
      val LS_4505 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LYF LS-5009 */
      val LS_5009 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LYF LS-5010 */
      val LS_5010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-5013 */
      val LS_5013 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-5016 */
      val LS_5016 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-5020 */
      val LS_5020 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-5505 */
      val LS_5505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LYF LS-5506 */
      val LS_5506 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LYF LS-5512 */
      val LS_5512 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LS-6001 */
      val LS_6001 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF LT-8001 */
      val LT_8001 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LYF LT-8001-IRIS */
      val LT_8001_IRIS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LYF P839F30 */
      val P839F30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF P839F50 */
      val P839F50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LYF panda01a_msm8952_64 */
      val PANDA01A_MSM8952_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LYF ZTE_T920 */
      val ZTE_T920 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LYF zx55q05_64 */
      val ZX55Q05_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
