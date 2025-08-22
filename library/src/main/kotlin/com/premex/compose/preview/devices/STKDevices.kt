package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STK device specifications for Android Compose previews.
 *
 * This extension provides STK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STK: Any
  get() = object {
      /** STK cayenne */
      val CAYENNE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** STK Evo_2 */
      val EVO_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** STK STK_Sync_5e */
      val STK_SYNC_5E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** STK STK_Transporter_1 */
      val STK_TRANSPORTER_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** STK STK_X2 */
      val STK_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** STK X3 */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
