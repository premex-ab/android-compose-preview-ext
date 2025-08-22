package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iData device specifications for Android Compose previews.
 *
 * This extension provides iData device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Idata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Idata: Any
  get() = object {
      /** iData i3 */
      val I3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData iData_50 */
      val IDATA_50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** iData iData_K1 */
      val IDATA_K1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData iData_K1_EEA */
      val IDATA_K1_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData iData_P1_mini */
      val IDATA_P1_MINI = "spec:width=800,height=1280,unit=px,dpi=220"

      /** iData iData_T1_UHF */
      val IDATA_T1_UHF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iData iData_T2 */
      val IDATA_T2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** iData K3Pro */
      val K3PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData K3S */
      val K3S = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData K8 */
      val K8 = "spec:width=480,height=800,unit=px,dpi=240"

      /** iData T1 */
      val T1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iData T1Pro */
      val T1PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iData T3_Pro */
      val T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
