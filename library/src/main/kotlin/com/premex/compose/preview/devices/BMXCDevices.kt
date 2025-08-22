package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BMXC device specifications for Android Compose previews.
 *
 * This extension provides BMXC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BMXC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BMXC: Any
  get() = object {
      /** BMXC BM108 */
      val BM108 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMXC JR-M802 */
      val JR_M802 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMXC K107 */
      val K107 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMXC K107-EEA */
      val K107_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMXC M107 */
      val M107 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** BMXC M863 */
      val M863 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMXC M863-EEA */
      val M863_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
