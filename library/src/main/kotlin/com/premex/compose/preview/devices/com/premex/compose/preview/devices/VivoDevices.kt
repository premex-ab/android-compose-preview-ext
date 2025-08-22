package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * vivo device specifications for Android Compose previews.
 *
 * This extension provides vivo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vivo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vivo: Any
  get() = object {
      /** DeviceSpec(manufacturer=vivo, code=bbk6735_65c_l, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=bbk6735_65c_l,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BBK6735_65C_L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=bbk6752_lwt_kk, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=bbk6752_lwt_kk,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BBK6752_LWT_KK = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=bbk6752_lwt_l, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=bbk6752_lwt_l,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BBK6752_LWT_L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=DPD2106, width=1600, height=2560, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2106, width=1600,
      height=2560, dpi=400, isGoogleDevice=false).code */
      val DPD2106 = "spec:width=1600,height=2560,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2221, width=1968, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2221, width=1968,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val DPD2221 = "spec:width=1968,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2305, width=1840, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2305, width=1840,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val DPD2305 = "spec:width=1840,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2307, width=1968, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2307, width=1968,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val DPD2307 = "spec:width=1968,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2345, width=1968, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2345, width=1968,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val DPD2345 = "spec:width=1968,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2424, width=1600, height=2464, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2424, width=1600,
      height=2464, dpi=400, isGoogleDevice=false).code */
      val DPD2424 = "spec:width=1600,height=2464,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2429, width=2064, height=3096, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2429, width=2064,
      height=3096, dpi=400, isGoogleDevice=false).code */
      val DPD2429 = "spec:width=2064,height=3096,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=DPD2437, width=1968, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=DPD2437, width=1968,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val DPD2437 = "spec:width=1968,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vivo, code=msm8916_32, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=msm8916_32, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MSM8916_32 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=PD1401CL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1401CL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1401CL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1415A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1415A, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1415A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1415BA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1415BA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1415BA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1415D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1415D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1415D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1421V, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1421V, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1421V = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1501D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1501D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1501D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1502A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1502A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1502A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1502L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1502L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1502L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1505, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1505, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1510, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1510, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PD1510 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=PD1515A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1515A, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1515A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1515BA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1515BA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1515BA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1522A, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1522A, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val PD1522A = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=PD1523, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1523, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1523 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1524, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1524, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1524 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1524B, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1524B, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1524B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1602, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1602, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1602 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1603, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1610, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1610, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1610 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1612, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1612, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1612 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1613, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1613, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1613 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1616, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1616, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1616 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1616B, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1616B, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1616B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1619, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1619, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1619 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1621, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1621, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1621 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1621B, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1621B, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1621B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1624, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1624, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1624 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1628, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1628, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1628 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1635, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1635, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1635 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1705, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1705, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1705 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1708, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1708, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1708 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1708C, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1708C, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PD1708C = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=PD1709, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1709, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1709 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1709F_EX, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1709F_EX, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PD1709F_EX = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1710, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1710, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1710 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1710F_EX, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1710F_EX, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PD1710F_EX = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1718, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1718, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD1718 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1721, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1721, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1721 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1728, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1728, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1728 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1728UD, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1728UD, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1728UD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1730, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1730, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1730 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1730C, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1730C, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1730C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1730D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1730D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1730D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1730E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1730E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1730E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1730G, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1730G, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val PD1730G = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=PD1731, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1731, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1731 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1731C, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1731C, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1731C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1731D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1731D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1731D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1732, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1732, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1732 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1801, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1801, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1801 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1803, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1803, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1803 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1805, width=1080, height=2316, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1805, width=1080,
      height=2316, dpi=480, isGoogleDevice=false).code */
      val PD1805 = "spec:width=1080,height=2316,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1806, width=1080, height=2316, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1806, width=1080,
      height=2316, dpi=480, isGoogleDevice=false).code */
      val PD1806 = "spec:width=1080,height=2316,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1806B, width=1080, height=2316, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1806B, width=1080,
      height=2316, dpi=480, isGoogleDevice=false).code */
      val PD1806B = "spec:width=1080,height=2316,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1809, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1809, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1809 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1813, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1813, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1813 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1813B, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1813B, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1813B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1813C, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1813C, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PD1813C = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1813D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1813D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1813D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1813E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1813E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1813E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1814, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1814, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1814 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1816, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1816, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1816 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1818, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1818, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1818 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1818B, width=1440, height=2960, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1818B, width=1440,
      height=2960, dpi=420, isGoogleDevice=false).code */
      val PD1818B = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=PD1818C, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1818C, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PD1818C = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=PD1818E, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1818E, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PD1818E = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=PD1818G, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1818G, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PD1818G = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1821, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1821, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1821 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1824, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1824, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1824 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1829, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1829, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PD1829 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=vivo, code=PD1831, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1831, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1831 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1832, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1832, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1832 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1836, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1836, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val PD1836 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1838, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1838, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1838 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1901, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1901, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val PD1901 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1911, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1911, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1911 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1913, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1913, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1913 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1914, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1914, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1914 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1916, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1916, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1916 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1921, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1921, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1921 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1922, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1922, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1922 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1923, width=1080, height=2256, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1923, width=1080,
      height=2256, dpi=440, isGoogleDevice=false).code */
      val PD1923 = "spec:width=1080,height=2256,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=PD1924, width=1080, height=2256, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1924, width=1080,
      height=2256, dpi=440, isGoogleDevice=false).code */
      val PD1924 = "spec:width=1080,height=2256,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=PD1928, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1928, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1928 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1930, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1930, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val PD1930 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD1932, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1932, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD1932 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1934, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1934, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1934 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1936, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1936, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1936 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1936G, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1936G, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1936G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1938, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1938, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD1938 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1941, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1941, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1941 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1945, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1945, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PD1945 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1950, width=1080, height=2256, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1950, width=1080,
      height=2256, dpi=440, isGoogleDevice=false).code */
      val PD1950 = "spec:width=1080,height=2256,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=PD1955, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1955, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD1955 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1962, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1962, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD1962 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1963, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1963, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD1963 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1965, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1965, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1965 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1981, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1981, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD1981 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1986, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1986, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD1986 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD1990, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD1990, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD1990 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2001, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2001, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2001 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2002, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2002, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD2002 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2005, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2005, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2005 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2011, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2011, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2011 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2012, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2012, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2012 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2019, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2019, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD2019 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2020, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2020, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2020 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2023, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2023, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PD2023 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2024, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2024, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2024 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2031, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2031, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2031 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2031EA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2031EA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2031EA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2034, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2034, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2034 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2034D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2034D, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2034D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2036, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2036, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2036 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2046, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2046, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2046 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2047, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2047, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2047 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2048, width=1080, height=2404, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2048, width=1080,
      height=2404, dpi=480, isGoogleDevice=false).code */
      val PD2048 = "spec:width=1080,height=2404,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2049, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2049, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2049 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2054, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2054, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2054 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2055, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2055, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2055 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2056, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2056, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2056 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2057, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2057, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2057 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2061, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2061, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2061 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2065, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2065, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2065 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2066, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2066, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2066 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2066B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2066B, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2066B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2068, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2068, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2068 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2069, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2069, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2069 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2072, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2072, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2072 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2073, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2073, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2073 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2080, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2080, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2080 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2085, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2085, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2085 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2092, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2092, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2092 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2102, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2102, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2102 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2106, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2106, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2106 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2111, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2111, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2111 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2115, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2115, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2115 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2118, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2118, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2118 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2121, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2121, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2121 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2123, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2123, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2123 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2130, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2130, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2130 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2131, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2131, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2131 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2133, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2133, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2133 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2134, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2134, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2134 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2136, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2136, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2136 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2140, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2140, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val PD2140 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=PD2141, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2141, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2141 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2143, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2143, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2143 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2145, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2145, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2145 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2148, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2148, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2148 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2154, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2154, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2154 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2156, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2156, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2156 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2156U, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2156U, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2156U = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2157, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2157, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2157 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2158, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2158, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2158 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2162, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2162, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2162 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2163, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2163, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2163 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2164, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2164, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2164 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2164U, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2164U, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2164U = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2165, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2165, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2165 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2166, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2166, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2166 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2168, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2168, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2168 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2170, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2170, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val PD2170 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2171, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2171, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2171 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2172, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2172, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2172 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2178, width=1916, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2178, width=1916,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PD2178 = "spec:width=1916,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2180, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2180, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2180 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2183, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2183, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2183 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2185, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2185, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2185 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2186, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2186, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2186 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2188, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2188, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2188 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2190, width=1080, height=2404, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2190, width=1080,
      height=2404, dpi=480, isGoogleDevice=false).code */
      val PD2190 = "spec:width=1080,height=2404,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2196, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2196, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2196 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2199, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2199, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2199 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2203, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2203, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2203 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2207, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2207, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val PD2207 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2217, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2217, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2217 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2218, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2218, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2218 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2219, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2219, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2219 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2220, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2220, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2220 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2224, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2224, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2224 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2227, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2227, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2227 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2229, width=1916, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2229, width=1916,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PD2229 = "spec:width=1916,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2230, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2230, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2230 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2231, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2231, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2231 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2232, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2232, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2232 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2236, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2236, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2236 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2238, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2238, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2238 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2239, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2239, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2239 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2241, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2241, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2241 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2242, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2242, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2242 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2243, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2243, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2243 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2244, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2244, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2244 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2245, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2245, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2245 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2254, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2254, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2254 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2256, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2256, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val PD2256 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2266, width=1916, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2266, width=1916,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PD2266 = "spec:width=1916,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2270, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2270, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2270 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2271, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2271, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2271 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2272, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2272, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2272 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2278, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2278, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2278 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2279, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2279, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2279 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2279J, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2279J, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2279J = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2282, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2282, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2282 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2283, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2283, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2283 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2284, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2284, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2284 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2285, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2285, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2285 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2301, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2301, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2301 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2302, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2302, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2302 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2303, width=2200, height=2480, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2303, width=2200,
      height=2480, dpi=520, isGoogleDevice=false).code */
      val PD2303 = "spec:width=2200,height=2480,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=vivo, code=PD2304, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2304, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2304 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2307, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2307, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2307 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2309, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2309, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2309 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2312, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2312, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2312 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2313, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2313, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2313 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2314, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2314, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val PD2314 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2317, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2317, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val PD2317 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2318, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2318, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val PD2318 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2323, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2323, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2323 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2327, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2327, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val PD2327 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2329, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2329, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2329 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2334, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2334, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2334 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2337, width=2200, height=2480, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2337, width=2200,
      height=2480, dpi=520, isGoogleDevice=false).code */
      val PD2337 = "spec:width=2200,height=2480,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=vivo, code=PD2338, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2338, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2338 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2344, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2344, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2344 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2352, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2352, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2352 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2353, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2353, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2353 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2354, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2354, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2354 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2354M, width=720, height=1608, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2354M, width=720,
      height=1608, dpi=320, isGoogleDevice=false).code */
      val PD2354M = "spec:width=720,height=1608,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2357, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2357, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val PD2357 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2361, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2361, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2361 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2362, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2362, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2362 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2364, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2364, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2364 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2366, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2366, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PD2366 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2403, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2403, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2403 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2405, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2405, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2405 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2408, width=1440, height=3168, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2408, width=1440,
      height=3168, dpi=480, isGoogleDevice=false).code */
      val PD2408 = "spec:width=1440,height=3168,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2410, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2410, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val PD2410 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2415, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2415, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2415 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2417, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2417, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2417 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2419, width=1216, height=2640, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2419, width=1216,
      height=2640, dpi=560, isGoogleDevice=false).code */
      val PD2419 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2425, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2425, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2425 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2426, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2426, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2426 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2429, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2429, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2429 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2430, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2430, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2430 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2435, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2435, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val PD2435 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2436, width=2200, height=2480, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2436, width=2200,
      height=2480, dpi=520, isGoogleDevice=false).code */
      val PD2436 = "spec:width=2200,height=2480,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=vivo, code=PD2442, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2442, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PD2442 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2444, width=720, height=1608, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2444, width=720,
      height=1608, dpi=320, isGoogleDevice=false).code */
      val PD2444 = "spec:width=720,height=1608,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=PD2445, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2445, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val PD2445 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2452, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2452, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2452 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2453, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2453, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PD2453 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=PD2454, width=1440, height=3168, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2454, width=1440,
      height=3168, dpi=480, isGoogleDevice=false).code */
      val PD2454 = "spec:width=1440,height=3168,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2456, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2456, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val PD2456 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2463, width=1440, height=3168, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2463, width=1440,
      height=3168, dpi=480, isGoogleDevice=false).code */
      val PD2463 = "spec:width=1440,height=3168,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2464, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2464, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val PD2464 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=PD2465, width=1216, height=2640, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=PD2465, width=1216,
      height=2640, dpi=560, isGoogleDevice=false).code */
      val PD2465 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=vivo, code=V1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=V2144, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2144, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2144 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2145, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2145, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2145 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2151, width=1080, height=2404, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2151, width=1080,
      height=2404, dpi=440, isGoogleDevice=false).code */
      val V2151 = "spec:width=1080,height=2404,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2154, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2154, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2154 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2158, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2158, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val V2158 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2201, width=1080, height=2404, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2201, width=1080,
      height=2404, dpi=440, isGoogleDevice=false).code */
      val V2201 = "spec:width=1080,height=2404,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2202, width=1080, height=2404, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2202, width=1080,
      height=2404, dpi=440, isGoogleDevice=false).code */
      val V2202 = "spec:width=1080,height=2404,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2204, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2204, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val V2204 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2205, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2205, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val V2205 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2206, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2206, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2206 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2207, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2207, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2207 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2217, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2217, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val V2217 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2218, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2218, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2218 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2219, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2219, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2219 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2222, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2222, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2222 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2225, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2225, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val V2225 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2230, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2230, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2230 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2231, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2231, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2231 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2236, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2236, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val V2236 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=V2237, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2237, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2237 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2239, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2239, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2239 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2244, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2244, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2244 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2247, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2247, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val V2247 = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2248, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2248, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val V2248 = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2248G, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2248G, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val V2248G = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2249, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2249, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val V2249 = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2250, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2250, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2250 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2254, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2254, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val V2254 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2303, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2303, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2303 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2307, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2307, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2307 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2308, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2308, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2308 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2309, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2309, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2309 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2310, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2310, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2310 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2315, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2315, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2315 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2317, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2317, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2317 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2318, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2318, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2318 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2319, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2319, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2319 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2321, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2321, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2321 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2327, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2327, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2327 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2330, width=2200, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2330, width=2200,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val V2330 = "spec:width=2200,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2333, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2333, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2333 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2334, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2334, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2334 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2338, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2338, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val V2338 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2339, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2339, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2339 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2342, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2342, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2342 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2343, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2343, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2343 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2344, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2344, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2344 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2346, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2346, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val V2346 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2347, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2347, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2347 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2348, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2348, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2348 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2352, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2352, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2352 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2355, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2355, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val V2355 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2403, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2403, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2403 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2404, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2404, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2404 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2413, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2413, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2413 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2415, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2415, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val V2415 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2418, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2418, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2418 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2419, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2419, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2419 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2420, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2420, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2420 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2422, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2422, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2422 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2427, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2427, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2427 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2428, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2428, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2428 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2429, width=2200, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2429, width=2200,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val V2429 = "spec:width=2200,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2430, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2430, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val V2430 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2434, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2434, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2434 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2436, width=720, height=1608, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2436, width=720,
      height=1608, dpi=300, isGoogleDevice=false).code */
      val V2436 = "spec:width=720,height=1608,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2437, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2437, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val V2437 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2439, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2439, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2439 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2440, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2440, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2440 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2441, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2441, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2441 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2446, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2446, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val V2446 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=V2502, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2502, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val V2502 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V2503, width=1216, height=2640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2503, width=1216,
      height=2640, dpi=480, isGoogleDevice=false).code */
      val V2503 = "spec:width=1216,height=2640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=V2504, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2504, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val V2504 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=vivo, code=V2506, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V2506, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val V2506 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=V3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=V3Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=V3Max, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V3MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=X5Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=X5Pro, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X5PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=Y11, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y11, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Y11 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y15, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y15, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y15 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y15S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y15S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y15S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y21, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y21, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y21 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y21L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y21L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y21L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y27, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y27, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y27 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=Y31, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y31, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y31 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=Y31i, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y31i, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y31I = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y31L, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y31L, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y31L = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=Y37, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y37, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y37 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=Y51, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=Y51, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y51 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=1601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1601, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1603, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1603, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1603 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1606, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1606, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val _1606 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vivo, code=1609, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1609, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1609 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1610, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1610, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1611, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1611, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _1611 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1714, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1714, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1714 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1716, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1716, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val _1716 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1718, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1718, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val _1718 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1719, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1719, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _1719 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1723, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1723, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1723 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1723CF, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1723CF, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1723CF = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1724, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1724, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _1724 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1725, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1725, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1725 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1726, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1726, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1726 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1727, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1727, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1727 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1727ID, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1727ID, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1727ID = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1801, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1801, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _1801 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1802, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1802, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1802 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1803, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1803, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1803 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1804, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1804, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1804 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1805, width=1080, height=2316, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1805, width=1080,
      height=2316, dpi=480, isGoogleDevice=false).code */
      val _1805 = "spec:width=1080,height=2316,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1806, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1806, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1806 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1807, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1807, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1807 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1807N, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1807N, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1807N = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1808, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1808, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1808 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1811, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1811, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1811 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1812, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1812, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1812 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1813, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1813, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1813 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1814, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1814, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1814 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1815, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1815, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1815 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1816, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1816, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1816 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1817, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1817, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1817 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1818, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1818, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1818 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1818N, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1818N, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1818N = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1819, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1819, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1819 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1819N, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1819N, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1819N = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1820, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1820, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1820 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1851, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1851, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val _1851 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1901, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1901, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1901 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1902, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1902, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1902 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1902D, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1902D, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1902D = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1904, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1904, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1904 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1906, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1906, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1906 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1907, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1907, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1907 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1907N, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1907N, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1907N = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1909, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1909, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1909 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1910, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1910, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1910 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1910N, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1910N, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1910N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1912, width=1080, height=2256, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1912, width=1080,
      height=2256, dpi=440, isGoogleDevice=false).code */
      val _1912 = "spec:width=1080,height=2256,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=1913, width=1080, height=2256, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1913, width=1080,
      height=2256, dpi=440, isGoogleDevice=false).code */
      val _1913 = "spec:width=1080,height=2256,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=1915, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1915, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1915 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1916, width=720, height=1544, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1916, width=720,
      height=1544, dpi=320, isGoogleDevice=false).code */
      val _1916 = "spec:width=720,height=1544,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1917, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1917, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1917 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1919, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1919, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1919 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1920, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1920, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1920 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1921, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1921, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1921 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1930, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1930, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1930 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1933, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1933, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val _1933 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1937, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1937, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1937 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=1938, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1938, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val _1938 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=1951, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=1951, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1951 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=2004, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2004, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val _2004 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=2005, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2005, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val _2005 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=2006, width=1080, height=2376, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2006, width=1080,
      height=2376, dpi=480, isGoogleDevice=false).code */
      val _2006 = "spec:width=1080,height=2376,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vivo, code=2015, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2015, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _2015 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vivo, code=2018, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2018, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2018 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2023, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2023, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2023 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2025, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2025, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2025 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2026, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2026, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2026 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2028, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2028, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2028 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2030, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2030, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2030 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2034, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2034, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2034 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2036, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2036, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2036 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2037, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2037, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2037 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2040, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2040, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2040 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2041, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2041, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2041 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2044, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2044, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2044 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2045, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2045, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2045 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2046, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2046, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2046 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2047, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2047, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2047 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2050, width=1080, height=2404, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2050, width=1080,
      height=2404, dpi=440, isGoogleDevice=false).code */
      val _2050 = "spec:width=1080,height=2404,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2055, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2055, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2055 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2058, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2058, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2058 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2059, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2059, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2059 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2060, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2060, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2060 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2061, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2061, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2061 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2105, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2105, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2105 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2109, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2109, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2109 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2110, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2110, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2110 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2111, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2111, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2111 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2114, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2114, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2114 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2116, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2116, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2116 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2120, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2120, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2120 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2124, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2124, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2124 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2126, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2126, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2126 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2127, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2127, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2127 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2129, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2129, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2129 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2130, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2130, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2130 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2131, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2131, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2131 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2132, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2132, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2132 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2135, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2135, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2135 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2141, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2141, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2141 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=vivo, code=2149, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2149, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2149 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=vivo, code=2160, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vivo, code=2160, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val _2160 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
