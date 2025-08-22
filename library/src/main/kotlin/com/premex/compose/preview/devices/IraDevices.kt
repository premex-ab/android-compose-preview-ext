package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA device specifications for Android Compose previews.
 *
 * This extension provides IRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ira.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ira: Any
  get() = object {
      /** IRA IRA801 */
      val IRA801 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRA IRA_DUO_PLUS */
      val IRA_DUO_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** IRA IRA_W801 */
      val IRA_W801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRA T1021 */
      val T1021 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** IRA T1030A */
      val T1030A = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** IRA T803 */
      val T803 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRA T808 */
      val T808 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
