package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cricket device specifications for Android Compose previews.
 *
 * This extension provides Cricket device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cricket.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cricket: Any
  get() = object {
      /** Cricket EC211001 */
      val EC211001 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** Cricket EC211002 */
      val EC211002 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Cricket EC211003 */
      val EC211003 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Cricket EC211004 */
      val EC211004 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** Cricket SL100EA */
      val SL100EA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cricket SL101AE */
      val SL101AE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cricket SL219C */
      val SL219C = "spec:width=720,height=1600,unit=px,dpi=260"

      /** Cricket SN304AE */
      val SN304AE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Cricket SN509C */
      val SN509C = "spec:width=720,height=1600,unit=px,dpi=260"

      /** Cricket U304AC */
      val U304AC = "spec:width=480,height=960,unit=px,dpi=213"

      /** Cricket U325AC */
      val U325AC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cricket U380AC */
      val U380AC = "spec:width=720,height=1560,unit=px,dpi=300"

      /** Cricket U6080AC */
      val U6080AC = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Cricket U705AC */
      val U705AC = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Cricket v350c */
      val V350C = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cricket WTCKT01 */
      val WTCKT01 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Cricket ZON */
      val ZON = "spec:width=720,height=1640,unit=px,dpi=280"

  }
